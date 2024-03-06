// 605. Can Place Flowers
// Easy
// Topics
// Companies
// You have a long flowerbed in which some of the plots are planted, and some are not.
//However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
//and an integer n, return true if n new flowers can be planted
//in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
var canPlaceFlowers = function () {
    const flowerbed=[0,0,1,0,1];
    let n=1;
    let current;
    let prev;
    let next;
  for (let i = 0; i < flowerbed.length; i++) {
    let current = flowerbed[i];
    let prev = flowerbed[i-1];
    let next = flowerbed[i+1];
    if(current===0 && (prev===0 || prev==undefined) && (next===0 || next==undefined)){
        flowerbed[i]=1;
        n--;
    }
  }
  return n <= 0;
};

canPlaceFlowers();
