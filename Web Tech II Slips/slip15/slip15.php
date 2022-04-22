<?php
$a = array("Fracture", "Bomberman Land", "Nitrobike", "Culdcept Saga", "Facebreaker", "MLB Power Pros 2008", "Mushroom Men: The Spore Wars", "Dragon Quest V: Hand of the Heavenly Bride", "Ninjatown", "Super Dodgeball Brawlers", "Dokapon Kingdom", "Alone in the Dark", "NBA 09: The Inside", "Sega Superstars Tennis", "Baja: Edge of Control", "Destroy All Humans! Big Willy Unleashed", "Space Invaders Extreme", "Ultimate Band", "The Club", "Madagascar: Escape 2 Africa", "NBA Ballers: Chosen One", "Dream Pinball 3D", "Madagascar: Escape 2 Africa", "Pro Evolution Soccer 2008", "Avalon Code", "Disgaea DS", "Guitar Rock Tour", "Lost in Blue 3", "Syberia", "Afrika", "NFL Head Coach 09", "NHL 2K9", "Brothers in Arms: Double Time", "ObsCure: The Aftermath", "MotoGP 08", "NFL Head Coach 09", "NFL Tour", "Pinball Hall of Fame: The Williams Collection", "Baja: Edge of Control", "NFL Tour", "Wall-E", "Ninja Reflex", "Conflict: Denied Ops", "Top Spin 3", "Blitz: The League II", "Hellboy: The Science of Evil", "Castlevania Judgment", "Death Jr. II: Root of Evil", "Raiden IV", "Metal Slug 7", "Spider-Man: Web of Shadows", "Trauma Center: Under The Knife 2", "Fracture", "Alone in the Dark", "Final Fantasy Fables: Chocobo's Dungeon", "The King of Fighters Collection: The Orochi Saga", "Klonoa: Door to Phantomile", "Samurai Warriors: Katana", "Battle of the Bands", "Hellboy: The Science of Evil", "Dragon Ball: Origins", "Ninja Reflex", "Space Bust-A-Move", "Top Spin 3", "UEFA Euro 2008", "Blast Works: Build, Trade, Destroy", "FIFA Street 3", "Blitz: The League II", "Space Chimps", "The Spiderwick Chronicles", "Etrian Odyssey II: Heroes of Lagaard", "Line Rider 2: Unbound", "The King of Fighters Collection: The Orochi Saga", "Target: Terror", "Legendary", "Universe at War: Earth Assault", "Smash Court Tennis 3", "Code Lyoko: Fall of X.A.N.A", "Knights in the Nightmare", "Lock's Quest", "Master of the Monster Lair", "N+", "Pipe Mania", "The Spiderwick Chronicles", "Summon Night: Twin Age", "Wild Arms XF", "FIFA Street 3", "MotoGP 08", "Harvey Birdman: Attorney at Law", "Let's Tap", "NHL 2K9", "Conflict: Denied Ops", "Worms: A Space Oddity", "UEFA Euro 2008", "Overlord: Raising Hell", "Battle Fantasia", "Bangai-O Spirits", "Dungeon Explorer: Warriors of Ancient Arts", "From the Abyss", "New International Track & Field", "Soul Bubbles", "Tropix!", "Unsolved Crimes", "Zubo", "Ford Racing Off Road", "Harvey Birdman: Attorney at Law", "Secret Agent Clank", "Space Invaders Extreme", "Armored Core: For Answer", "Legendary", "Agatha Christie: Evil Under the Sun", "Agatha Christie: And Then There Were None", "Armored Core: For Answer", "Cradle of Rome", "The Dark Spire", "Flower, Sun and Rain", "Insecticide", "Izuna 2: The Unemployed Ninja Returns", "Looney Tunes: Cartoon Conductor", "Nanostray 2", "Hellboy: The Science of Evil", "Pipe Mania", "UEFA Euro 2008", "Vampire Rain", "Baroque", "Supreme Commander", "Hail to the Chimp", "Assassin's Creed: Altar's Chronicles", "The Legend of Kage 2", "Rhapsody: A Musical Adventure", "Secret Files: Tunguska", "Fading Shadows", "Hail to the Chimp", "Secret Files: Tunguska", "Chicken Hunter");

$q = $_GET['q'];

if (strlen($q) > 0) {
    $match = "";
    for ($i = 0; $i < count($a); $i++) {
        if (strtolower($q) == strtolower(substr($a[$i], 0, strlen($q)))) {
            if ($match == "") {
                $match = $a[$i];
            } else {
                $match = $match . "," . $a[$i];
            }

        }
    }
    if ($match == "") {
        echo "No Suggestios";
    } else {
        echo $match;
    }

}
