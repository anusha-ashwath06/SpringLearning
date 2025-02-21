import { useContext } from 'react';
import { AuthContext } from './security/AuthContext'
function FooterComponent(){
    const authContext = useContext(AuthContext)
    console.log(`Footer component - ${authContext.number}`);
    return (
        <footer className = "footer">
        <div className = "container">
           your footer 
        </div>
        <hr/>
        </footer>
    )
}

export default FooterComponent