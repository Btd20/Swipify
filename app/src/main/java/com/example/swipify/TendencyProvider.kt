package com.example.swipify

class TendencyProvider {
    companion object{
        val tendencyList = listOf<Tendency>(
            Tendency(
                "Top más escuchado",
                "drawable/gradient1",
                "drawable/classic_rock.jpg"
            ),
            Tendency(
                "Éxitos de España",
                "drawable/gradient2",
                "drawable/good_times.jpg"
            ),
            Tendency(
                "Hits Internacional",
                "drawable/gradient3",
                "drawable/retro.jpg"
            ),
            Tendency(
                "Tendencias",
                "drawable/gradient4",
                "drawable/album.jpg"
            ),
        )
    }
}