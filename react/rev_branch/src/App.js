import TrainingTable from "./components/batches/trainingTable";
import Employee from "./components/employees/employee";
import ContactUs from "./components/welcome-page/contact-us";
import Intro from "./components/welcome-page/intro";

const jesse = { employeeName: "Jesse Sabbath", title: "Quality Auditor", estSalary: 100 };

/*
  Important React Terms:
    - State Vs Props
    - Parent vs Child
    - Single JSX Element or HTML Element returns from a Component
    - Hooks - hooking into the state of a component
*/
function App() {
    return (
        <div>
            <Intro></Intro>
            <ContactUs></ContactUs>
            <Employee employeeName={"Adam Ranieri"} title="God-Tier Trainer" estSalary={10}></Employee>
            <Employee employeeName={"Charles Jester"} title="Trainer" estSalary={1}></Employee>
            <Employee {...jesse} />
            <TrainingTable />
        </div>
    );
}

export default App;
