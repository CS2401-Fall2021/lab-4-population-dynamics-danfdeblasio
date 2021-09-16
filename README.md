# lab4-Population (100 pts)

## Introduction

Ecology is the study of the relationships between living organisms and their physical environment. Population size is a commonly used measurement. However there are innumerable factors that can contribute to a species population size. One important facton however, is the predator-prey relationship. This has been studdied in-depth through looking at the populations of the moose and wolf populations on Isle Royale. For more details on the long-term study see https://isleroyalewolf.org/data/data/home.html. 

![populations](https://www.duluthnewstribune.com/incoming/article1714205.ece/alternates/BASE_LANDSCAPE/4219309%2B051718moose.jpg)

Ecologists try to come up with Population Models in order to predict what will happen to a population over several years. In general, this involves a relationship between this year's population and the previous years. 

## Modeling a Moose Population in Paradise
![paradise](https://i5.walmartimages.com/asr/1322e8cf-02cb-42b0-957c-5f67c4d33ad5_1.ed3040664283e11a726301a23f5e4332.jpeg?odnWidth=612&odnHeight=612&odnBg=ffffff)


First, let's assume we have a moose paradise with no predators, infinite resources,
and every moose lives to full maturity. Furthermore, you have a very special type
of moose population that allows you to have fractions of a moose. 

Note: You *CANNOT* have negative moose

Assume the following statistics:

* Each year in the Spring, 1/2 of the moose population produce a baby moose calf. 
* Every year in the Fall, 1/6 of the moose population dies due to old age.

You are working as an intern researcher, but your lab notes are incredibly messy 
and while you know at some point, a herd of <20 moose were added to the moose 
paradise, you don't know exactly when or exactly how many there were
at the begining. Furthermore, you're still waiting on this year's population
count to come in, so you don't quite know the exact number yet. To make things 
worse, your boss is looking for your report to be finished as soon as possible
in order to get the team more funding for moose-counting. What can you do? 


### Method 1
Write a function that determines when the first moose came to your moose
paradise given the current population

* Should you do this recursively? Or iteratively? (2 pts)

* Why? (5 pts)

* What edge cases should you consider? (3 pts)

* Implement the proposed solution. (10 pts)

* If there were 1000 moose today, how long ago did the first moose arrive(3 pts)


### Method 2
Eureka! You found that there were 12 moose in your original moose herd, but only 
know that the current moose population is at least 1000.

Write a function that returns how long ago the herd began

* Should you do this recursively? Or iteratively? (2 pts)

* Why? (5 pts)

* What edge cases should you consider? (3 pts)

* Implement the proposed solution. (10 pts)

* If there are at least 1000 moose today, how long ago did the first 12 moose arrive(3 pts)



## Introducing predators

!(moon_moon)[https://i.pinimg.com/originals/52/ea/da/52eada7605adb6384de1d5575cecd188.jpg]
Sadly it turns out your Moose Paradise Department had to merge with the Wolf Pack Research Organization due to a string of budget cuts. This certainly complicates your population model. 


* Each year in the Spring, 1/2 of the moose population produce a baby moose calf. 
* Every year in the Fall, 1/6 of the moose population dies due to old age.
* Every year in the winter, each wolf kills 2 moose for food


* Each year in the Spring, 1/4 of the wolf population produce a wolf baby. 
* Every year in the Fall, 1/10 of the wolf population dies due to old age.


### Method 3
You are tasked with predicting the population in 50 years, but you don't know 
exactly how many moose or wolves are there to start, but as soon as the grad
students come back from counting, you want to be ready to submit your report
to the department. 

Write a function to calculate the moose and wolf population in a given number of years

* Should you do this recursively? Or iteratively? (2 pts)

* Why? (5 pts)

* What edge cases should you consider? (3 pts)

* Implement the proposed solution. (10 pts)

* If you start with 180 moose and 10 wolves, what is the moose population in 50 years(3 pts)?


### Method 4
Good news! You got a grant to start a smaller study where you get to choose how 
many moose you bring into a population of 5 wolves. But your grant requires you 
to have exactly 500 moose and 25 wolves at some point in the next 50 years.
How many moose do you start with? 

Write a function that calculates the number of moose to start with given
the starting number of wolves, a target number of wolves and moose, and the
maximum number of years you have to reach your target

* Should you do this recursively? Or iteratively? (5 pts)

* Why? (5 pts)

* What edge cases should you consider? (5 pts)

* Implement the proposed solution. (10 pts)

* How many Moose should you start with if you begin with 5 wolves and want to 
  reach a population of 500 moose and 25 wolves at some point within the next 50 years?

