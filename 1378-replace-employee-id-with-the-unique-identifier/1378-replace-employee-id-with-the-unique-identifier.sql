# Write your MySQL query statement below
Select u.unique_id,e.name from EmployeeUNI u right JOIN Employees e on e.id=u.id;