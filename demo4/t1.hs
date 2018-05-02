{-# LANGUAGE ExistentialQuantification #-}

data Säiliö = forall x . FB x => Säiliö x

class FB x where arvo :: x -> String

instance FB Int where
	arvo x = x `mod` 15 == 0 = "FizzBuzz" |
		 x `mod` 5 == 0 = "Buzz" |
		 x `mod` 3 == 0 = "Fizz" |
		 x 

fizzbuzzaa :: Int -> Säiliö
fizzbuzzaa x = FB x 

kaikkiLuvut :: [Int]
kaikkiLuvut = [1..]

main = mapM print [ fizzbuzzaa x | x <- take 15 kaikkiLuvut ]
