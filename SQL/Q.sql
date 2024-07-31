SELECT customer.cust_name
FROM customer
LEFT JOIN orders ON customer.cust_code = orders.cust_code
WHERE orders.cust_code IS NULL;

SELECT c.cust_name, COUNT(o.ord_num)
FROM customer c
INNER JOIN orders o ON c.cust_code = o.cust_code
GROUP BY c.cust_name;

SELECT c.cust_name
FROM customer c
INNER JOIN orders o ON c.cust_code = o.cust_code
WHERE c.work_area = 'New York'
ORDER BY o.ord_amount DESC
LIMIT 1;

SELECT cust_name
FROM customer
WHERE cust_code IN (
    SELECT cust_code
    FROM orders
    GROUP BY cust_code
    HAVING COUNT(*) > 2
	
);



