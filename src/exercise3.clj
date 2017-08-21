(ns exercise3)

(defn fibonacci [number]
  (if (< number 2) 
  	number 
  	(+ (fibonacci (- number 1)) (fibonacci (- number 2)))))
