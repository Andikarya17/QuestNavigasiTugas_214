package com.example.questnavigastugas_214

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.example.questnavigastugas_214.ui.theme.QuestNavigasTugas_214Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestNavigasTugas_214Theme {
                DataApp()

                }
            }
        }
    }
