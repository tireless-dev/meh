package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSettings: ImageVector
    get() {
        val current = _userSettings
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.UserSettings",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 10 V8 h-2.1 a5 5 0 0 0 -.73 -1.75 l1.49 -1.5 -1.42 -1.4 -1.49 1.48 A5 5 0 0 0 24 4.1 V2 h-2 v2.1 a5 5 0 0 0 -1.75 .73 l-1.5 -1.49 -1.4 1.42 1.48 1.49 A5 5 0 0 0 18.1 8 H16 v2 h2.1 a5 5 0 0 0 .73 1.75 l-1.49 1.5 1.42 1.4 1.49 -1.48 A5 5 0 0 0 22 13.9 V16 h2 v-2.1 a5 5 0 0 0 1.75 -.73 l1.5 1.49 1.4 -1.42 -1.48 -1.49 A5 5 0 0 0 27.9 10Z m-7 2 a3 3 0 1 1 3 -3 3 3 0 0 1 -3 3 m-7 18 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M9 10 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 10
                moveTo(x = 30.0f, y = 10.0f)
                // V 8
                verticalLineTo(y = 8.0f)
                // h -2.1
                horizontalLineToRelative(dx = -2.1f)
                // a 5 5 0 0 0 -0.73 -1.75
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.73f,
                    dy1 = -1.75f,
                )
                // l 1.49 -1.5
                lineToRelative(dx = 1.49f, dy = -1.5f)
                // l -1.42 -1.4
                lineToRelative(dx = -1.42f, dy = -1.4f)
                // l -1.49 1.48
                lineToRelative(dx = -1.49f, dy = 1.48f)
                // A 5 5 0 0 0 24 4.1
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 24.0f,
                    y1 = 4.1f,
                )
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2.1
                verticalLineToRelative(dy = 2.1f)
                // a 5 5 0 0 0 -1.75 0.73
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.75f,
                    dy1 = 0.73f,
                )
                // l -1.5 -1.49
                lineToRelative(dx = -1.5f, dy = -1.49f)
                // l -1.4 1.42
                lineToRelative(dx = -1.4f, dy = 1.42f)
                // l 1.48 1.49
                lineToRelative(dx = 1.48f, dy = 1.49f)
                // A 5 5 0 0 0 18.1 8
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 18.1f,
                    y1 = 8.0f,
                )
                // H 16
                horizontalLineTo(x = 16.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2.1
                horizontalLineToRelative(dx = 2.1f)
                // a 5 5 0 0 0 0.73 1.75
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.73f,
                    dy1 = 1.75f,
                )
                // l -1.49 1.5
                lineToRelative(dx = -1.49f, dy = 1.5f)
                // l 1.42 1.4
                lineToRelative(dx = 1.42f, dy = 1.4f)
                // l 1.49 -1.48
                lineToRelative(dx = 1.49f, dy = -1.48f)
                // A 5 5 0 0 0 22 13.9
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 22.0f,
                    y1 = 13.9f,
                )
                // V 16
                verticalLineTo(y = 16.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2.1
                verticalLineToRelative(dy = -2.1f)
                // a 5 5 0 0 0 1.75 -0.73
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.75f,
                    dy1 = -0.73f,
                )
                // l 1.5 1.49
                lineToRelative(dx = 1.5f, dy = 1.49f)
                // l 1.4 -1.42
                lineToRelative(dx = 1.4f, dy = -1.42f)
                // l -1.48 -1.49
                lineToRelative(dx = -1.48f, dy = -1.49f)
                // A 5 5 0 0 0 27.9 10z
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 27.9f,
                    y1 = 10.0f,
                )
                close()
                // m -7 2
                moveToRelative(dx = -7.0f, dy = 2.0f)
                // a 3 3 0 1 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // a 3 3 0 0 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // m -7 18
                moveToRelative(dx = -7.0f, dy = 18.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 3 3 0 0 0 -3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = -3.0f,
                )
                // H 7
                horizontalLineTo(x = 7.0f)
                // a 3 3 0 0 0 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v -5
                verticalLineToRelative(dy = -5.0f)
                // a 5 5 0 0 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // a 5 5 0 0 1 5 5z
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                close()
                // M 9 10
                moveTo(x = 9.0f, y = 10.0f)
                // a 3 3 0 1 1 -3 3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 3.0f,
                )
                // a 3 3 0 0 1 3 -3
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = -3.0f,
                )
                // m 0 -2
                moveToRelative(dx = 0.0f, dy = -2.0f)
                // a 5 5 0 1 0 5 5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 5.0f,
                    dy1 = 5.0f,
                )
                // a 5 5 0 0 0 -5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -5.0f,
                    dy1 = -5.0f,
                )
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _userSettings = it }
    }

@Suppress("ObjectPropertyName")
private var _userSettings: ImageVector? = null
