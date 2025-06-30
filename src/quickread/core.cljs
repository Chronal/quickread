(ns quickread.core
  (:require
   [reagent.core :as r]
   [reagent.dom.client :as rdc]
   ["esm:./lib/mupdf.js" :as mupdf]))

(defn hello []
  (print "Hello, World!"))

(defn app []
  [:p "Hello!"])

(defonce react-root (rdc/create-root (.getElementById js/document "quickread")))

(defn run []
  (rdc/render react-root [app]))
