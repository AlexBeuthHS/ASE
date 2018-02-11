(ns RPS)
(defn getPlayersHand []
  (println "Chose your Hand: (r) for Rock, (p) for Paper or (s) for Scissor")
  (let [hand (read-line)]
    (if (get {"r" true "p" true "s" true} hand) hand)))


(defn computeWinner [player computer]
  (let [playerVsComputer [player computer]]
    (cond
      (= player computer) 0
      (= playerVsComputer ["p" "r"]) 1
      (= playerVsComputer ["r" "p"]) 2
      (= playerVsComputer ["r" "s"]) 1
      (= playerVsComputer ["s" "r"]) 2
      (= playerVsComputer ["s" "p"]) 1
      (= playerVsComputer ["p" "s"]) 2)))


(defn startGame []
  (let [computersHand (rand-nth ["r" "p" "s"])
          playersHand (getPlayersHand)
          winner (computeWinner computersHand playersHand)]
    (println "The Computer guessed:" computersHand)
    (println "You guessed:" playersHand)
    (cond
      (= playersHand nil) (println "Your entry was invalid.")
      (= winner 0) (println "Game tied!")
      (= winner 1) (println "Computer wins!")
      (= winner 2) (println "Player wins!"))
    )
  )

(loop []
  (startGame)
  (recur))
