import { useState } from 'react';
import { PropTypes } from 'prop-types'
import './Counter.css'
import CounterButton from './CounterButton'

export default function Counter() {

  const [count, setCount] = useState(0)
  function incrementCounterParentFunction(by) {
    setCount(count + by)
  }
  function decrementCounterFunction(by) {
    setCount(count - by)
  }
  function resetCounter(){
    setCount(0)
  }
  return (
    <>
      <span className="totalcount" >{count}</span>
      <CounterButton by={1}
       incrementMethod={incrementCounterParentFunction} 
       decrementMethod = {decrementCounterFunction} />
      <CounterButton by={2} 
      incrementMethod={incrementCounterParentFunction} 
      decrementMethod = {decrementCounterFunction} />
      <CounterButton by={5} 
      incrementMethod={incrementCounterParentFunction}
       decrementMethod = {decrementCounterFunction} />
      
      <button className="resetButton"
          onClick={resetCounter}
        >Reset</button>
    
    
    </>


  )
}

