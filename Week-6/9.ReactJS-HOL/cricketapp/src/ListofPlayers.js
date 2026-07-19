import React from "react";

function ListofPlayers() {
    const players = [
        { name: "Virat Kohli", score: 95 },
        { name: "Rohit Sharma", score: 82 },
        { name: "Shubman Gill", score: 65 },
        { name: "KL Rahul", score: 58 },
        { name: "Hardik Pandya", score: 75 },
        { name: "Ravindra Jadeja", score: 62 },
        { name: "Rishabh Pant", score: 88 },
        { name: "Suryakumar Yadav", score: 45 },
        { name: "Mohammed Shami", score: 72 },
        { name: "Jasprit Bumrah", score: 55 },
        { name: "Kuldeep Yadav", score: 91 }
    ];

    const below70 = players.filter(player => player.score < 70);

    return (
        <div>
            <h2>List of Players</h2>
            {players.map((player, index) => (
                <div key={index}>
                    {player.name} - {player.score}
                </div>
            ))}
            <h2>Players with Scores Below 70</h2>
            {below70.map((player, index) => (
                <div key={index}>
                    {player.name} - {player.score}
                </div>
            ))}
        </div>
    );
}

export default ListofPlayers;