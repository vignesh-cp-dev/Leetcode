# Write your MySQL query statement below
Select * from Cinema where MOD(id,2)=1 and description NOT IN ('boring') order by rating desc;