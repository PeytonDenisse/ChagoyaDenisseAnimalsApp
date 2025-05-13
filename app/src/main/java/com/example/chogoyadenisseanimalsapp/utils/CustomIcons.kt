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




public val undefined2: ImageVector
    get() {
        if (_undefined2 != null) {
            return _undefined2!!
        }
        _undefined2 = ImageVector.Builder(
            name = "Dog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.25f, 16.25f)
                horizontalLineToRelative(1.5f)
                lineTo(12f, 17f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16f, 14f)
                verticalLineToRelative(0.5f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.42f, 11.247f)
                arcTo(13.152f, 13.152f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 14.556f)
                curveTo(4f, 18.728f, 7.582f, 21f, 12f, 21f)
                reflectiveCurveToRelative(8f, -2.272f, 8f, -6.444f)
                arcToRelative(11.702f, 11.702f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.493f, -3.309f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 14f)
                verticalLineToRelative(0.5f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8.5f, 8.5f)
                curveToRelative(-0.384f, 1.05f, -1.083f, 2.028f, -2.344f, 2.5f)
                curveToRelative(-1.931f, 0.722f, -3.576f, -0.297f, -3.656f, -1f)
                curveToRelative(-0.113f, -0.994f, 1.177f, -6.53f, 4f, -7f)
                curveToRelative(1.923f, -0.321f, 3.651f, 0.845f, 3.651f, 2.235f)
                arcTo(7.497f, 7.497f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5.277f)
                curveToRelative(0f, -1.39f, 1.844f, -2.598f, 3.767f, -2.277f)
                curveToRelative(2.823f, 0.47f, 4.113f, 6.006f, 4f, 7f)
                curveToRelative(-0.08f, 0.703f, -1.725f, 1.722f, -3.656f, 1f)
                curveToRelative(-1.261f, -0.472f, -1.855f, -1.45f, -2.239f, -2.5f)
            }
        }.build()
        return _undefined2!!
    }

private var _undefined2: ImageVector? = null




public val undefined3: ImageVector
    get() {
        if (_undefined3 != null) {
            return _undefined3!!
        }
        _undefined3 = ImageVector.Builder(
            name = "Trees",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10f, 10f)
                verticalLineToRelative(0.2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.9f, 16f)
                horizontalLineTo(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.8f)
                verticalLineTo(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7f, 16f)
                verticalLineToRelative(6f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13f, 19f)
                verticalLineToRelative(3f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 19f)
                horizontalLineToRelative(8.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -1.7f)
                lineTo(18f, 14f)
                horizontalLineToRelative(0.3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -1.7f)
                lineTo(16f, 9f)
                horizontalLineToRelative(0.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -1.7f)
                lineTo(13f, 3f)
                lineToRelative(-1.4f, 1.5f)
            }
        }.build()
        return _undefined3!!
    }

private var _undefined3: ImageVector? = null



public val undefined4: ImageVector
    get() {
        if (_undefined4 != null) {
            return _undefined4!!
        }
        _undefined4 = ImageVector.Builder(
            name = "Turtle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 10f)
                lineToRelative(2f, 4f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-3f)
                lineToRelative(2f, -4f)
                horizontalLineToRelative(4f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(4.82f, 7.9f)
                lineTo(8f, 10f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15.18f, 7.9f)
                lineTo(12f, 10f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(16.93f, 10f)
                horizontalLineTo(20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4f)
                horizontalLineTo(2f)
            }
        }.build()
        return _undefined4!!
    }

private var _undefined4: ImageVector? = null



