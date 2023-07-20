import logo from './logo.svg';
import './App.css';
import { CodeBlock } from "./codeblock/CodeBlock";
import "highlight.js/styles/github.css";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <CodeBlock></CodeBlock>
      </header>
    </div>
  );
}

export default App;
