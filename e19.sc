(define pHelper (lambda (all chk l m)
                  (cond ((null? all) (cons l (cons chk (cons m '()))))
                        (else
                        (let ((x (car all)))
                          (if (<= x chk) 
                              (pHelper (cdr all) chk (cons x l) m)
                              (pHelper (cdr all) chk l (cons x m))))))))

(define partition (lambda (l)
                      (pHelper (cdr l) (car l) '() '())))



(define quicksort (lambda (l)
                    (cond ((null? l) l)
                          (else
                          (let ((lx (partition l)))
                            (append (quicksort (car lx)) (cons (cadr lx) (quicksort (caddr lx)))))))))