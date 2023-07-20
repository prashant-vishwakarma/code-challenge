import "highlight.js/styles/github.css";
import highlight from "highlight.js";
import { useEffect } from "react";

export const CodeBlock = () => {

    useEffect(() => {
        highlight.highlightAll();
    }, []);

    return <div>
        <pre>
        <code className="language-java">
            System.out.println("hello World");
        </code>
        </pre>
    </div>

};
