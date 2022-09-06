import React, { useRef } from "react";

// Know the default syntax for making a component inside of react
export default function ContactUs() {
    // const email = "cj@mail.com";
    // Use React Hooks, specifically here we are using useRef()
    // hooks are special functionas that almost ALWAYS start with use that "supercharges" your functional components

    const email = useRef(); // does not invoke a re-render of the component

    // console.log(email.current?.value); // JS syntax add the ? before the .key-name when trying to access a variable that may not be defined or Key

    function sendEmail() {
        alert(`An email has been sent to ${email.current.value}`);
    }

    return (
        // React.Fragment helps remove the impact that the <div> would have on the styling of the webpage
        <React.Fragment>
            <h3>Request further information by adding your email below</h3>
            <input placeholder="Enter email address" ref={email}></input>
            {email.current?.value === undefined ? (
                <button onClick={sendEmail}>Email Me</button>
            ) : (
                <p>Your email sent to {email.current.value}</p>
            )}
        </React.Fragment>
    );
}
