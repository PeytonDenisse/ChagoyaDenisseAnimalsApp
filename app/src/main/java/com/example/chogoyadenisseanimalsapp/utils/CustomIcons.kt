package com.example.chogoyadenisseanimalsapp.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val undefined: ImageVector
    get() {
        if (_undefined != null) {
            return _undefined!!
        }
        _undefined = ImageVector.Builder(
            name = "Pets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(180f, 485f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                moveToRelative(180f, -160f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                moveToRelative(240f, 0f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                moveToRelative(180f, 160f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                reflectiveQuadToRelative(71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                moveTo(266f, 885f)
                quadToRelative(-45f, 0f, -75.5f, -34.5f)
                reflectiveQuadTo(160f, 769f)
                quadToRelative(0f, -52f, 35.5f, -91f)
                reflectiveQuadToRelative(70.5f, -77f)
                quadToRelative(29f, -31f, 50f, -67.5f)
                reflectiveQuadToRelative(50f, -68.5f)
                quadToRelative(22f, -26f, 51f, -43f)
                reflectiveQuadToRelative(63f, -17f)
                reflectiveQuadToRelative(63f, 16f)
                reflectiveQuadToRelative(51f, 42f)
                quadToRelative(28f, 32f, 49.5f, 69f)
                reflectiveQuadToRelative(50.5f, 69f)
                quadToRelative(35f, 38f, 70.5f, 77f)
                reflectiveQuadToRelative(35.5f, 91f)
                quadToRelative(0f, 47f, -30.5f, 81.5f)
                reflectiveQuadTo(694f, 885f)
                quadToRelative(-54f, 0f, -107f, -9f)
                reflectiveQuadToRelative(-107f, -9f)
                reflectiveQuadToRelative(-107f, 9f)
                reflectiveQuadToRelative(-107f, 9f)
            }
        }.build()
        return _undefined!!
    }

private var _undefined: ImageVector? = null
