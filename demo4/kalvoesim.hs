class DatanTyyppi a where tyyppi:: a -> String

instance DatanTyyppi Int where tyyppi _ = "Kokonaisluku"
