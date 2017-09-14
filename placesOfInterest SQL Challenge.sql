/*
You are trying to decide where you want to go on your vacation. Your travel agency has provided you with database of possible destinations of your trip.

This database contains table countryActivities with the following structure:

id: unique id of the record;
country: the country name;
region: the region of this country;
leisure_activity_type: the type of activity provided in the region. It can only be equal to one of the following values: Adventure park, Golf, Kart racing, River cruise;
number_of_places: the number of resorts in said region where you can engage in such activity.
You want to see how many resorts in each country provide the activities you are interested in before you decide where to go on your vacation, but it is hard to do this using only the table provided by your travel agency. To make things easier, you decided to create a new table with a better structure.

Given the countryActivities table, compose the resulting table with five columns: country, adventure_park, golf, river_cruise and kart_racing. The first column should contain the country name, while the second, the third, the forth and the fifth columns should contain the number of resorts in the country that offer Adventure park, Golf, River cruise and Kart racing respectively. The table should be sorted by the country names in ascending order.

Example

For the following table countryActivities

id	country	region	leisure_activity_type	number_of_places
1	France	Normandy	River cruise	2
2	Germany	Bavaria	Golf	5
3	Germany	Berlin	Adventure park	2
4	France	Ile-de-France	River cruise	1
5	Sweden	Stockholm	River cruise	3
6	France	Normandy	Kart racing	4
the output should be

country	adventure_park	golf	river_cruise	kart_racing
France	0	0	3	4
Germany	2	5	0	0
Sweden	0	0	3	0
*/


/*Please add ; after each select statement*/
/*
CREATE PROCEDURE placesOfInterest()
BEGIN
SELECT  * from
(
SELECT country, leisure_activity_type, sum(number_of_places)
FROM countryActivities
GROUP BY country, leisure_activity_type) as a;
END
/*
/*Please add ; after each select statement*/
CREATE PROCEDURE placesOfInterest()
    SELECT country,
        SUM(IF(t LIKE 'A%',s,0)) adventure_park,
        SUM(IF(t LIKE 'G%',s,0)) golf,
        SUM(IF(t LIKE 'R%',s,0)) river_cruise,
        SUM(IF(t LIKE 'K%',s,0)) kart_racing
    FROM (SELECT country, leisure_activity_type t, SUM(number_of_places) s FROM countryActivities GROUP BY 1, 2) A
    GROUP BY 1;
