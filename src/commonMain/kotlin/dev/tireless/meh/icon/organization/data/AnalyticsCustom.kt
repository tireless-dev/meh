package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AnalyticsCustom: ImageVector
    get() {
        val current = _analyticsCustom
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.AnalyticsCustom",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m29.7 19.3 -3 -3 a1 1 0 0 0 -1.4 0 L16 25.58 V30 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 M19.6 28 H18 v-1.59 l5 -5 L24.59 23Z M26 21.59 24.41 20 26 18.41 27.59 20Z M30 4 h-7 v2 h3.59 L19 13.59 l-4.3 -4.3 a1 1 0 0 0 -1.4 0 L6 16.6 7.41 18 14 11.41 l4.3 4.3 a1 1 0 0 0 1.4 0 L28 7.4 V11 h2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 29.7 19.3
                moveTo(x = 29.7f, y = 19.3f)
                // l -3 -3
                lineToRelative(dx = -3.0f, dy = -3.0f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 16 25.58
                lineTo(x = 16.0f, y = 25.58f)
                // V 30
                verticalLineTo(y = 30.0f)
                // h 4.41
                horizontalLineToRelative(dx = 4.41f)
                // l 9.3 -9.3
                lineToRelative(dx = 9.3f, dy = -9.3f)
                // a 1 1 0 0 0 0 -1.4
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -1.4f,
                )
                // M 19.6 28
                moveTo(x = 19.6f, y = 28.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v -1.59
                verticalLineToRelative(dy = -1.59f)
                // l 5 -5
                lineToRelative(dx = 5.0f, dy = -5.0f)
                // L 24.59 23z
                lineTo(x = 24.59f, y = 23.0f)
                close()
                // M 26 21.59
                moveTo(x = 26.0f, y = 21.59f)
                // L 24.41 20
                lineTo(x = 24.41f, y = 20.0f)
                // L 26 18.41
                lineTo(x = 26.0f, y = 18.41f)
                // L 27.59 20z
                lineTo(x = 27.59f, y = 20.0f)
                close()
                // M 30 4
                moveTo(x = 30.0f, y = 4.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3.59
                horizontalLineToRelative(dx = 3.59f)
                // L 19 13.59
                lineTo(x = 19.0f, y = 13.59f)
                // l -4.3 -4.3
                lineToRelative(dx = -4.3f, dy = -4.3f)
                // a 1 1 0 0 0 -1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -1.4f,
                    dy1 = 0.0f,
                )
                // L 6 16.6
                lineTo(x = 6.0f, y = 16.6f)
                // L 7.41 18
                lineTo(x = 7.41f, y = 18.0f)
                // L 14 11.41
                lineTo(x = 14.0f, y = 11.41f)
                // l 4.3 4.3
                lineToRelative(dx = 4.3f, dy = 4.3f)
                // a 1 1 0 0 0 1.4 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 1.4f,
                    dy1 = 0.0f,
                )
                // L 28 7.4
                lineTo(x = 28.0f, y = 7.4f)
                // V 11
                verticalLineTo(y = 11.0f)
                // h 2z
                horizontalLineToRelative(dx = 2.0f)
                close()
            }
            // M4 2 H2 v26 a2 2 0 0 0 2 2 h8 v-2 H4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 4 2
                moveTo(x = 4.0f, y = 2.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 26
                verticalLineToRelative(dy = 26.0f)
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
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4z
                horizontalLineTo(x = 4.0f)
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
        }.build().also { _analyticsCustom = it }
    }

@Suppress("ObjectPropertyName")
private var _analyticsCustom: ImageVector? = null
