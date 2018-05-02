class Show a where
	show:: a -> String

data Muu = Möö | Mää
instance Show Muu where
	show Mää = "Möö"
	show Möö = "Mää"

main = show Möö
