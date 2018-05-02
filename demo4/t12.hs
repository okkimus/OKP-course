{-# LANGUAGE ExistentialQuantification #-}

data Säiliö = forall x . FB x => Säiliö x

class FB x where arvo :: x -> String

instance FB Int where
	arvo x = "FizzBuzz"

instance Show FB where show (FB x) = show x

fizzbuzzaa :: Int -> Säiliö
fizzbuzzaa x = Säiliö x 

kaikkiLuvut :: [Int]
kaikkiLuvut = [1..]

main = mapM print [ fizzbuzzaa x | x <- take 15 kaikkiLuvut ]
