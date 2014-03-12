;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(ns gorilla-repl.vega
  (:require [gorilla-renderable.core :as render]))

(defrecord Vega [content])

(defn vega [content] (Vega. content))

(extend-type Vega
  render/Renderable
  (render [self]
    {:type :vega :content (:content self) :value (pr-str self)}))