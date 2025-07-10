(ns quickread.core
  (:require
   [reagent.core :as r]
   [reagent.dom.client :as rdc]))


(defn app []
  [:main
   [:h1 "QuickRead"]
   [:p "A simple tool to help you modify pdfs and read them quickly."]
   [:input {:type "file"
            :label "Click here to upload a file to read."
            :accept "application/pdf"}]])

(defonce react-root
  (rdc/create-root (.getElementById js/document "quickread")))

(defn run []
  (rdc/render react-root [app]))
