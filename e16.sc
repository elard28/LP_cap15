(define sort
  (lambda (numList)
    (cond
      ((null? numList) '())
      ((= (car numList) (apply max numList))
       (cons (car numList) (sort (cdr numList))))
      (else (sort (append (list-tail numList (- (length numList) 1))
                             (reverse (list-tail (reverse numList) 1)))))
      )))