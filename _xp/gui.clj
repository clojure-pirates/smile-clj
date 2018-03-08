;; GUI using JavaFX
(ns smile-clj-dev.gui
  (:require [fn-fx.fx-dom :as dom]
            [fn-fx.controls :as ui]
            [fn-fx.diff :refer [component defui render should-update?]]))



(defn fn-fx []
  (let [u (ui/stage
           :title "Hello World!"
           :shown true
           :min-width 300
           :min-height 300
           :scene (ui/scene
                   :root (ui/stack-pane
                          :children [(ui/button
                                      :text "Say 'Hello World'"
                                      :on-action {:say "Hello World!"}
                                      )])))
        handler-fn (fn [evt]
                     (println "Received Event: " evt))]
    (dom/app u handler-fn)))


(fn-fx)

;; GUI using Swing
(use 'seesaw.core)
  (invoke-later
                  (-> (frame :title "Hello",
                             :content "Hello, Seesaw",
                             :on-close :exit)
                      pack!
                      show!))
