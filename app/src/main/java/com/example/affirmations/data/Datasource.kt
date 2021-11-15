package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.fall_out_boy),
            Affirmation(R.string.affirmation2, R.drawable.demi_lovato),
            Affirmation(R.string.affirmation3, R.drawable.miley_cyrus),
            Affirmation(R.string.affirmation4, R.drawable.motley_crue),
            Affirmation(R.string.affirmation5, R.drawable.harry_styles),
            Affirmation(R.string.affirmation6, R.drawable.panic_at_the_disco),
            Affirmation(R.string.affirmation7, R.drawable.one_direction),
            Affirmation(R.string.affirmation8, R.drawable.my_chemical_romance),
            Affirmation(R.string.affirmation9, R.drawable.little_mix),
            Affirmation(R.string.affirmation10, R.drawable.the_wanted)
        )
    }
}
