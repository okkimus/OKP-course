data Maa = Hertta | Pata | Risti | Ruutu deriving (Enum, Show, Eq)

arvoksi :: Int -> String
arvoksi i | i == 1 = "A" | i < 11 = show i | i == 11 = "J" | i == 12 = "Q" | i == 13 = "K"

kortit = [(maa, arvoksi arvo) | maa <- [Hertta .. Ruutu], arvo <- [1..13]]

type Kortti = (Maa, String)
type Pakka = [Kortti]

korttiMäärä = length kortit

musta :: Kortti -> Bool
musta x = fst x == Pata || fst x == Risti

mustatkortit = filter musta kortit

main = print mustatkortit
