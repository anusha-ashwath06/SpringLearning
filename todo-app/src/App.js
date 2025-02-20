import logo from './logo.svg';
//import LearningComponent from './components/learning-examples/LearningComponent'
import './App.css';
import TodoApp from './components/todo/TodoApp'
function App() {
  return (
    <div className="App">
    <TodoApp/>
    </div>
  );
}

export default App;
// function PlayingWithProps(properties){
//   console.log(properties)
//   console.log(properties.property1)
//   console.log(properties.property2)
//   return (
//     <div>Props</div>
//   )

// }
// function PlayingWithProps( {property1, property2}){
//   console.log(property1)
//   console.log(property2)
//   return (
//     <div>Props</div>
//   )

// }
