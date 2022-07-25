-- SELECT from Nobel Tutorial

--Change the query shown so that it displays Nobel prizes for 1950.
SELECT yr, subject, winner
FROM nobel
WHERE yr = 1950

--Show who won the 1962 prize for literature.
SELECT winner
FROM nobel
WHERE yr = 1962
AND subject = 'literature'

--Show the year and subject that won 'Albert Einstein' his prize.
SELECT yr, subject
FROM nobel
WHERE winner like 'Albert Einstein'

--Give the name of the 'peace' winners since the year 2000, including 2000.
SELECT winner
FROM nobel
WHERE yr >= 2000
AND subject like 'peace'
