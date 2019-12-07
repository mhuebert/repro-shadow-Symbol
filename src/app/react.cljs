(ns app.react
  (:require ["react" :as react]))

(defn main []
  (-> (.-innerHTML js/document.body)
      (set! "Hello, world")))