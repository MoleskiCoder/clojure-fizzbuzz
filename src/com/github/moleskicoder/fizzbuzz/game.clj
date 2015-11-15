(ns com.github.moleskicoder.fizzbuzz.game
  (:gen-class))

(defn modzero? [n, m]
  (zero? (mod n m)))

(defn check? [n, m, express]
  (let [check (modzero? n m)]
    (if check (print express))
    check))

(defn fizz? [n]
  (check? n 3 "Fizz"))

(defn buzz? [n]
  (check? n 5 "Buzz"))

(defn fizzbuzz [n]
  (let [
         fizz (fizz? n)
         buzz (buzz? n)]
    (if-not (or fizz buzz) (print n)))
  (println))

(defn game [low high]
  (map fizzbuzz (range low high)))

(defn -main
  [& args]
  (doall (game 1 101)))
