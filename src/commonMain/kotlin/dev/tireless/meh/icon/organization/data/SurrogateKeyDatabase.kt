package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SurrogateKeyDatabase: ImageVector
    get() {
        val current = _surrogateKeyDatabase
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SurrogateKeyDatabase",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M25 15 c-2.8 0 -5 2.2 -5 5 v.6 l-5 5 V30 h4.4 l5 -5 H25 c2.8 0 5 -2.2 5 -5 s-2.2 -5 -5 -5 m3 5.7 c-.4 1.6 -2 2.6 -3.7 2.2 h-.5 c0 -.1 -5.2 5.1 -5.2 5.1 H17 v-1.6 l5.2 -5.2 v-.5 a2.3 2.3 0 0 1 -.1 -1.4 3.04 3.04 0 1 1 5.9 1.5Z m-2 -.8 c0 .6 -.4 1 -1 1 s-1 -.4 -1 -1 .4 -1 1 -1 1 .4 1 1 M6 13 h18 V5 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h7 v-2 H6 v-6 h7 v-2 H6z m0 -8 h16 v6 H6z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 25 15
                moveTo(x = 25.0f, y = 15.0f)
                // c -2.8 0 -5 2.2 -5 5
                curveToRelative(
                    dx1 = -2.8f,
                    dy1 = 0.0f,
                    dx2 = -5.0f,
                    dy2 = 2.2f,
                    dx3 = -5.0f,
                    dy3 = 5.0f,
                )
                // v 0.6
                verticalLineToRelative(dy = 0.6f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 4.4
                horizontalLineToRelative(dx = 4.4f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // H 25
                horizontalLineTo(x = 25.0f)
                // c 2.8 0 5 -2.2 5 -5
                curveToRelative(
                    dx1 = 2.8f,
                    dy1 = 0.0f,
                    dx2 = 5.0f,
                    dy2 = -2.2f,
                    dx3 = 5.0f,
                    dy3 = -5.0f,
                )
                // s -2.2 -5 -5 -5
                reflectiveCurveToRelative(
                    dx1 = -2.2f,
                    dy1 = -5.0f,
                    dx2 = -5.0f,
                    dy2 = -5.0f,
                )
                // m 3 5.7
                moveToRelative(dx = 3.0f, dy = 5.7f)
                // c -0.4 1.6 -2 2.6 -3.7 2.2
                curveToRelative(
                    dx1 = -0.4f,
                    dy1 = 1.6f,
                    dx2 = -2.0f,
                    dy2 = 2.6f,
                    dx3 = -3.7f,
                    dy3 = 2.2f,
                )
                // h -0.5
                horizontalLineToRelative(dx = -0.5f)
                // c 0 -0.1 -5.2 5.1 -5.2 5.1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = -0.1f,
                    dx2 = -5.2f,
                    dy2 = 5.1f,
                    dx3 = -5.2f,
                    dy3 = 5.1f,
                )
                // H 17
                horizontalLineTo(x = 17.0f)
                // v -1.6
                verticalLineToRelative(dy = -1.6f)
                // l 5.2 -5.2
                lineToRelative(dx = 5.2f, dy = -5.2f)
                // v -0.5
                verticalLineToRelative(dy = -0.5f)
                // a 2.3 2.3 0 0 1 -0.1 -1.4
                arcToRelative(
                    a = 2.3f,
                    b = 2.3f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -0.1f,
                    dy1 = -1.4f,
                )
                // a 3.04 3.04 0 1 1 5.9 1.5z
                arcToRelative(
                    a = 3.04f,
                    b = 3.04f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.9f,
                    dy1 = 1.5f,
                )
                close()
                // m -2 -0.8
                moveToRelative(dx = -2.0f, dy = -0.8f)
                // c 0 0.6 -0.4 1 -1 1
                curveToRelative(
                    dx1 = 0.0f,
                    dy1 = 0.6f,
                    dx2 = -0.4f,
                    dy2 = 1.0f,
                    dx3 = -1.0f,
                    dy3 = 1.0f,
                )
                // s -1 -0.4 -1 -1
                reflectiveCurveToRelative(
                    dx1 = -1.0f,
                    dy1 = -0.4f,
                    dx2 = -1.0f,
                    dy2 = -1.0f,
                )
                // s 0.4 -1 1 -1
                reflectiveCurveToRelative(
                    dx1 = 0.4f,
                    dy1 = -1.0f,
                    dx2 = 1.0f,
                    dy2 = -1.0f,
                )
                // s 1 0.4 1 1
                reflectiveCurveToRelative(
                    dx1 = 1.0f,
                    dy1 = 0.4f,
                    dx2 = 1.0f,
                    dy2 = 1.0f,
                )
                // M 6 13
                moveTo(x = 6.0f, y = 13.0f)
                // h 18
                horizontalLineToRelative(dx = 18.0f)
                // V 5
                verticalLineTo(y = 5.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // H 6
                horizontalLineTo(x = 6.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 22
                verticalLineToRelative(dy = 22.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
                // m 0 -8
                moveToRelative(dx = 0.0f, dy = -8.0f)
                // h 16
                horizontalLineToRelative(dx = 16.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 6z
                horizontalLineTo(x = 6.0f)
                close()
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
        }.build().also { _surrogateKeyDatabase = it }
    }

@Suppress("ObjectPropertyName")
private var _surrogateKeyDatabase: ImageVector? = null
