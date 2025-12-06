package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ClassifierLanguage: ImageVector
    get() {
        val current = _classifierLanguage
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ClassifierLanguage",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M30 10 V2 h-8 v8 h3 v4 h-2 v2 h7 v-2 h-3 v-4Z m-6 -6 h4 v4 h-4Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 30 10
                moveTo(x = 30.0f, y = 10.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -3
                horizontalLineToRelative(dx = -3.0f)
                // v -4z
                verticalLineToRelative(dy = -4.0f)
                close()
                // m -6 -6
                moveToRelative(dx = -6.0f, dy = -6.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4z
                horizontalLineToRelative(dx = -4.0f)
                close()
            }
            // <polygon points="20.0 23.41 18.59 22.0 16.0 24.59 13.41 22.0 12.0 23.41 14.59 26.0 12.0 28.59 13.41 30.0 16.0 27.41 18.59 30.0 20.0 28.59 17.41 26.0 20.0 23.41" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 23.41
                moveTo(x = 20.0f, y = 23.41f)
                // L 18.59 22
                lineTo(x = 18.59f, y = 22.0f)
                // L 16 24.59
                lineTo(x = 16.0f, y = 24.59f)
                // L 13.41 22
                lineTo(x = 13.41f, y = 22.0f)
                // L 12 23.41
                lineTo(x = 12.0f, y = 23.41f)
                // L 14.59 26
                lineTo(x = 14.59f, y = 26.0f)
                // L 12 28.59
                lineTo(x = 12.0f, y = 28.59f)
                // L 13.41 30
                lineTo(x = 13.41f, y = 30.0f)
                // L 16 27.41
                lineTo(x = 16.0f, y = 27.41f)
                // L 18.59 30
                lineTo(x = 18.59f, y = 30.0f)
                // L 20 28.59
                lineTo(x = 20.0f, y = 28.59f)
                // L 17.41 26
                lineTo(x = 17.41f, y = 26.0f)
                // L 20 23.41z
                lineTo(x = 20.0f, y = 23.41f)
                close()
            }
            // <polygon points="20.0 14.0 12.0 14.0 12.0 16.0 15.0 16.0 15.0 21.0 17.0 21.0 17.0 16.0 20.0 16.0 20.0 14.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 14
                moveTo(x = 20.0f, y = 14.0f)
                // L 12 14
                lineTo(x = 12.0f, y = 14.0f)
                // L 12 16
                lineTo(x = 12.0f, y = 16.0f)
                // L 15 16
                lineTo(x = 15.0f, y = 16.0f)
                // L 15 21
                lineTo(x = 15.0f, y = 21.0f)
                // L 17 21
                lineTo(x = 17.0f, y = 21.0f)
                // L 17 16
                lineTo(x = 17.0f, y = 16.0f)
                // L 20 16
                lineTo(x = 20.0f, y = 16.0f)
                // L 20 14z
                lineTo(x = 20.0f, y = 14.0f)
                close()
            }
            // M7 9.86 a4 4 0 1 0 -2 0 V14 H2 v2 h7 v-2 H7Z M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 9.86
                moveTo(x = 7.0f, y = 9.86f)
                // a 4 4 0 1 0 -2 0
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                // V 14
                verticalLineTo(y = 14.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 7
                horizontalLineToRelative(dx = 7.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
                close()
                // M 4 6
                moveTo(x = 4.0f, y = 6.0f)
                // a 2 2 0 1 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
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
        }.build().also { _classifierLanguage = it }
    }

@Suppress("ObjectPropertyName")
private var _classifierLanguage: ImageVector? = null
