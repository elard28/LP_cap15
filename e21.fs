let rec pot a b =
	if b = 0 then 1
	else a * pot( a (b-1))