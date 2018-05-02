{-# LANGUAGE ExistentialQuantification #-}

data Säiliö = forall x . FB x => Säiliö x

class FB x where
	arvo :: (x -> String)

instance FB Int where
	arvo x = if x `mod` 15 == 0 then "FizzBuzz" else 
		 if x `mod` 5 == 0 then "Buzz" else 
		 if x `mod` 3 == 0 then "Fizz" else show x

instance Show (Säiliö) where show (Säiliö a) = arvo a

fizzbuzzaa :: Int -> Säiliö
fizzbuzzaa x = Säiliö x 

kaikkiLuvut :: [Int]
kaikkiLuvut = [1..]

main = mapM print [ fizzbuzzaa x | x <- take 15 kaikkiLuvut ]
