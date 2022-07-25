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

--Show all details (yr, subject, winner) of the literature prize winners for 1980 to 1989 inclusive.
SELECT yr, subject, winner
FROM nobel
WHERE (yr >= 1980 and yr <= 1989) 
AND (subject = 'literature')

--Show all details of the presidential winners:
--Theodore Roosevelt
--Thomas Woodrow Wilson
--Jimmy Carter
--Barack Obama
SELECT *
FROM nobel 
WHERE winner IN ('Theodore Roosevelt', 'Woodrow Wilson', 'Jimmy Carter', 'Barack Obama')

--Show the winners with first name John
SELECT winner
FROM nobel
WHERE winner like 'John%'

--Show the year, subject, and name of physics winners for 1980 together with the chemistry winners for 1984.
SELECT yr, subject, winner
FROM nobel
WHERE ( subject like 'physics' and yr like 1980)
OR ( subject like 'chemistry' and yr like 1984)

--Show the year, subject, and name of winners for 1980 excluding chemistry and medicine
SELECT yr, subject, winner
FROM nobel
WHERE yr = 1980
AND NOT subject IN ('chemistry', 'medicine')

--Show year, subject, and name of people who won a 'Medicine' prize in an early year (before 1910, not including 1910) together with winners of a 'Literature' prize in a later year (after 2004, including 2004)
SELECT yr, subject, winner
FROM nobel
WHERE (subject like 'medicine' AND yr < 1910)
OR(subject like 'literature' AND yr >= 2004)

--Find all details of the prize won by PETER GRÜNBERG
SELECT *
FROM nobel
WHERE winner IN ('Peter GRÜNBERG')

--Find all details of the prize won by EUGENE O'NEILL
--You can't put a single quote in a quote string directly. You can use two single quotes within a quoted string.
SELECT *
FROM nobel
WHERE winner IN ('EUGENE O''NEILL')

--List the winners, year and subject where the winner starts with Sir. Show the the most recent first, then by name order.
SELECT winner, yr, subject
FROM nobel
WHERE winner like 'sir%' 
ORDER BY yr DESC, winner 