import { createContext, useContext, useState } from "react";

export const AuthContext = createContext();
export const useAuth = () => useContext(AuthContext)
export default function AuthProvider({children}){
    const [number, setNumber] = useState(10)
    const [isAuthenticated, setAuthenticated] = useState(false)
    const [username, setusername] = useState(null)


   
    const valueToBeShared = {number, isAuthenticated, setAuthenticated}

    function login(username, password){
        if(username === 'in28minutes' && password === 'dummy'){
            setAuthenticated(true)
            setusername(username)
            return true
        } else{
            setAuthenticated(false)
            setusername(null)
            return false
        }
    }
    function logout(){
        setAuthenticated(false)
    }
    return(
       <AuthContext.Provider value = {{isAuthenticated, login, logout,username}} >
        {children}
       </AuthContext.Provider>
    )
}