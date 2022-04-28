// button click handler
let count = 0; // o => "x"  1 => "O"
let moves = 9;

function getWinner() {
  let box1 = document.getElementById("box-1").innerText;
  let box2 = document.getElementById("box-2").innerText;
  let box3 = document.getElementById("box-3").innerText;
  let box4 = document.getElementById("box-4").innerText;
  let box5 = document.getElementById("box-5").innerText;
  let box6 = document.getElementById("box-6").innerText;
  let box7 = document.getElementById("box-7").innerText;
  let box8 = document.getElementById("box-8").innerText;
  let box9 = document.getElementById("box-9").innerText;
  if (box1 === box2 && box1 === box3) return box1;
  else if (box4 === box5 && box4 === box6) return box4;
  else if (box7 === box8 && box7 === box9) return box7;
  else if (box1 === box4 && box1 === box7) return box1;
  else if (box2 === box5 && box2 === box8) return box2;
  else if (box3 === box6 && box3 === box9) return box3;
  else if (box1 === box5 && box1 === box9) return box1;
  else if (box3 === box5 && box3 === box7) return box3;
  else return -1; // winner is not yet decided
}
const replay = () => {
  for (let i = 1; i <= 9; i++) {
    document.getElementById("box-" + i).disabled = false;
    document.getElementById("box-" + i).className = "box enabled";
    document.getElementById("box-" + i).innerText = "";
  }
};
const reset = () => {
  for (let i = 1; i <= 9; i++) {
    document.getElementById("box-" + i).disabled = false;
    document.getElementById("box-" + i).className = "box enabled";
    document.getElementById("box-" + i).innerText = "";
  }
};

const play = (event) => {
  //apply event to generate new game state
  let box = event.target.id;

  // renders text on button clicked with X or O
  document.getElementById(box).innerHTML = count == 0 ? "X" : "O";
  moves = moves - 1;
  count == 0 ? (count = 1) : (count = 0);
  // disable the button clicked
  document.getElementById(box).disabled = true;
  let turnPlayedBy = count == 0 ? "X" : "O";
  document.getElementById(
    "next-player"
  ).innerHTML = `Turn Played By : ${turnPlayedBy}`;
  document.getElementById("move-count").innerHTML = `Moves Left : ${moves}`;

  // reset panel values to default values

  // implement logic to get the winner
  let winner = getWinner();
  if (winner !== -1 && winner != "") {
    //console.log(winner);
    document.getElementById("winner").innerText = `Winner is : ${winner}`;

    for (let i = 1; i <= 9; i++) {
      document.getElementById("box-" + i).disabled = true;
      document.getElementById("box-" + i).className = "box disabled";
    }
    document.getElementById("box-1").disabled = true;
    document.getElementById("box-2").disabled = true;
    document.getElementById("box-3").disabled = true;
    document.getElementById("box-4").disabled = true;
    document.getElementById("box-5").disabled = true;
    document.getElementById("box-6").disabled = true;
    document.getElementById("box-7").disabled = true;
    document.getElementById("box-8").disabled = true;
    document.getElementById("box-9").disabled = true;
  }

  // announce winner
};

// REPLAY-MODE :: replay-game-button-clicked->fetches events recorded->apply event->generates new game state->render game state

// reset game to start a new

// bind events to clickable buttons
function enableButtons() {}

module.exports = { play, enableButtons };
// export default play;
