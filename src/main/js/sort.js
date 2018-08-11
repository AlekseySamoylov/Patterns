/*
  Given: array [120, 150, 160,201,203,180,202]
  QualificationDistance: 7
  average best > qualificationDistance = 200
  Need: qualified
*/

function qualificationProcessor(attempts) {
  var first = 0;
  var second = 0;
  var third = 0;
  var counter;
  for (counter = 0; counter < attempts.length; counter++) {
    if (third < attempts[counter]) {
      first = second;
      second = third;
      third = attempts[counter]
    } else if (second < attempts[counter]) {
      first = second;
      second = attempts[counter]
    } else if (first < attempts[counter]) {
      first = attempts[counter]
    }
  }
  var averageResult = (first + second + third) / 3;
  console.log(
      first + " " + second + " " + third + "average result: " + averageResult);
}

function commonApproach(attempts) {
  attempts.sort();
  var lastIndex = attempts.length;
  var first = attempts[--lastIndex];
  var second = attempts[--lastIndex];
  var third = attempts[--lastIndex];
  var averageResult = (first + second + third) / 3;
  console.log(
      first + " " + second + " " + third + "average result: " + averageResult);
}

attempts = [120, 150, 160, 201, 203, 180, 202];
testArray = [];
qualificationDistance = 200;
for (var i = 0; i < 10000000; i++) {
  testArray[i] = Math.floor(Math.random() * 1000);
}

start = new Date().getTime();
commonApproach(testArray);
end = new Date().getTime();
console.log("common implementation: " + (end - start) + "ms");

var start = new Date().getTime();
qualificationProcessor(testArray);
var end = new Date().getTime();
console.log("my implementation: " + (end - start) + "ms");
