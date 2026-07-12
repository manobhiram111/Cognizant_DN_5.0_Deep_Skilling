import React from "react";

function UserPage() {
    return (
        <div>
            <h2>Welcome User</h2>
            <h3>Flight Details</h3>
            <ul>
                <li>Flight : Indigo 6E201</li>
                <li>From : Hyderabad</li>
                <li>To : Bangalore</li>
                <li>Time : 10:30 AM</li>
            </ul>
            <button>Book Ticket</button>
        </div>
    );
}

export default UserPage;