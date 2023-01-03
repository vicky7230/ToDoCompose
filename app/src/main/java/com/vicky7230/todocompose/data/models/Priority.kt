package com.vicky7230.todocompose.data.models


import androidx.compose.ui.graphics.Color
import com.vicky7230.todocompose.ui.theme.HighPriorityColor
import com.vicky7230.todocompose.ui.theme.LowPriorityColor
import com.vicky7230.todocompose.ui.theme.MediumPriorityColor
import com.vicky7230.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}