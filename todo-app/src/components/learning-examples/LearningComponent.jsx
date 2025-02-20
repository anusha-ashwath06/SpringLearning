// import logo from './logo.svg';
import FirstComponent from './FirstComponent'
import {FifthComponent} from './FirstComponent'
import SecondComponent from './SecondComponent'
import ThirdComponent from './ThirdComponent'
import FourthComponent from './FourthComponent'
import LearningJavaScripts from './LearningJavaScripts'

export default function LearningComponent() {
  return (
    <div className="App">
      <FirstComponent></FirstComponent>
      <SecondComponent></SecondComponent>
      <ThirdComponent/>
      <FourthComponent/>
      <FifthComponent/>
      <LearningJavaScripts/>
    </div>
  );
}
