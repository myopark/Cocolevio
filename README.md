# Cocolevio
Programming Challenge
In our Materials Marketplace we have many different companies all looking for the same material. However, each company is looking for a specific quantity of the material at a price they set themselves. A company approaches our team with a large amount of that material, but not enough to complete every request for it. Given the total amount of the material they have, the company asks us to find out what companies they should sell to in order to maximize their profits. This scenario happens frequently so we need to be able to compute the answer relatively quickly and with minimal processing power.

Please use the following as sample data:

https://s3.amazonaws.com/cocolevio-public/InterviewQuestionExample.PNG


Question: Given a set of data with a company name, quantity, and price and N (how much material that company has to sell). What is the maximum profit each company can gain selling to the other companies?


Assumptions: No negative values. Quantity is how much each company wants at that price. 


Intutition: 
Sounds similar to KnapSack Problem
This may indiciate it's a DP problem or even a Greedy algorithm -> but has proven not to work for some cases

Usually problems that ask for max or min is a DP question

Can see this problem being O(n) or O(n)^2 depending on how I want to store my values in an array. 
