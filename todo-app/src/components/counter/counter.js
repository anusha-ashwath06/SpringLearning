import { useState } from 'react';
import {PropTypes} from 'prop-types'
import './Counter.css'
export default function CounterButton({by}){
     const [count, setCount] = useState(0);
     console.log(by)
    function incrementCounterFunction(){
        setCount(count + by) 
    }
    function decrementCounterFunction(){
        setCount(count - by) 
    }
    return(
       <div className= "counter">
        <span className= "count">{count}</span>
        <div>
          <button className = "counterButton"
            onClick = {incrementCounterFunction}
          >+{by}</button>
          <button className = "counterButton"
            onClick = {decrementCounterFunction}
          >-{by} </button>
       </div>
    </div>

    )
}
CounterButton.propTypes = {
    by: PropTypes.number
}
CounterButton.defaultProps = {
    by: 1
}