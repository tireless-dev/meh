package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartMultitype: ImageVector
    get() {
        val current = _chartMultitype
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.ChartMultitype",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <rect width="2" height="8" x="28.0" y="22.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 22
                moveTo(x = 28.0f, y = 22.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="12" x="24.0" y="18.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 18
                moveTo(x = 24.0f, y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // <rect width="2" height="4" x="20.0" y="26.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 20 26
                moveTo(x = 20.0f, y = 26.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -2z
                horizontalLineToRelative(dx = -2.0f)
                close()
            }
            // M9 16 a7 7 0 1 0 7 7 7 7 0 0 0 -7 -7 m4.9 6 H10 v-3.9 a5 5 0 0 1 3.9 3.9 M9 28 a5 5 0 0 1 -1 -9.9 V22 a2 2 0 0 0 2 2 h3.9 A5 5 0 0 1 9 28 m13.54 -16 4 -6 H30 V4 h-4.54 l-4 6 H18 V2 h-2 v12 a2 2 0 0 0 2 2 h12 v-2 H18 v-2Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 16
                moveTo(x = 9.0f, y = 16.0f)
                // a 7 7 0 1 0 7 7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // a 7 7 0 0 0 -7 -7
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -7.0f,
                    dy1 = -7.0f,
                )
                // m 4.9 6
                moveToRelative(dx = 4.9f, dy = 6.0f)
                // H 10
                horizontalLineTo(x = 10.0f)
                // v -3.9
                verticalLineToRelative(dy = -3.9f)
                // a 5 5 0 0 1 3.9 3.9
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 3.9f,
                    dy1 = 3.9f,
                )
                // M 9 28
                moveTo(x = 9.0f, y = 28.0f)
                // a 5 5 0 0 1 -1 -9.9
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -1.0f,
                    dy1 = -9.9f,
                )
                // V 22
                verticalLineTo(y = 22.0f)
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
                // h 3.9
                horizontalLineToRelative(dx = 3.9f)
                // A 5 5 0 0 1 9 28
                arcTo(
                    horizontalEllipseRadius = 5.0f,
                    verticalEllipseRadius = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 9.0f,
                    y1 = 28.0f,
                )
                // m 13.54 -16
                moveToRelative(dx = 13.54f, dy = -16.0f)
                // l 4 -6
                lineToRelative(dx = 4.0f, dy = -6.0f)
                // H 30
                horizontalLineTo(x = 30.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h -4.54
                horizontalLineToRelative(dx = -4.54f)
                // l -4 6
                lineToRelative(dx = -4.0f, dy = 6.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // V 2
                verticalLineTo(y = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 12
                verticalLineToRelative(dy = 12.0f)
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
                // h 12
                horizontalLineToRelative(dx = 12.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 18
                horizontalLineTo(x = 18.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
            }
            // <circle cx="11.0" cy="7.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11 7
                moveTo(x = 11.0f, y = 7.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="9.0" cy="11.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 11
                moveTo(x = 9.0f, y = 11.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="7.0" cy="5.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 5
                moveTo(x = 7.0f, y = 5.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="5.0" cy="9.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 5 9
                moveTo(x = 5.0f, y = 9.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <circle cx="3.0" cy="13.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 3 13
                moveTo(x = 3.0f, y = 13.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
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
        }.build().also { _chartMultitype = it }
    }

@Suppress("ObjectPropertyName")
private var _chartMultitype: ImageVector? = null
