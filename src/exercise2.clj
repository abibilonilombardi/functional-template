(ns exercise2)

(defn only-greater-than-five [someList]
  (filter (fn is-greater-than-five [number] (> number 5)) someList))
