package com.example.facebookclone

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.facebookclone.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    private val stories = listOf(
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story),
        StoryData(R.drawable.profile, "Fahim Mohammod Fardous", R.drawable.story)
    )

    private val posts = listOf(
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),

        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),

        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),

        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        ),
        PostData(
            R.drawable.story,
            "Fahim Mohammod Fardous",
            "45m",
            R.drawable.valorant,
            150,
            "5 comments .",
            "6 shares",
            "Let's play a matach"
        )

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.bind(view)

        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.storyRv.layoutManager = layoutManager
        binding.storyRv.adapter = StoryAdapter(stories)

        val postLayoutManager = LinearLayoutManager(requireContext())
        binding.postRv.layoutManager = postLayoutManager
        binding.postRv.adapter = PostAdapter(posts)
    }
}
