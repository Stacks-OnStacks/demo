// JSX - or JavaScript XML, is an extension language that combines html/css/js

export default function Intro() {
    /*
    return a single JSX element as it is required
    every element must be contained inside of a single element
    */

    const locationName = "Tampa";
    const locationState = "FL";
    const locationZip = 11889;

    return (
        <div>
            {/* the {} allow for us to use JS in html  */}
            <h1>Welcome to Revature Branch, {locationName}!</h1>
            {/* You CAN make operations or use some functional programming inside of the {} but generally it's best practice to store them inside a variable and only access those variables */}
            <h3>
                We are location in {locationName}, {locationState} {locationZip + 10}
            </h3>
        </div>
    );
}
