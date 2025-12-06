package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VmdkDisk: ImageVector
    get() {
        val current = _vmdkDisk
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.VmdkDisk",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="10.5" cy="24.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10.5 24.5
                moveTo(x = 10.5f, y = 24.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // <rect width="2" height="5" x="19.5" y="14.964" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 17.99967 16.413883
                moveTo(x = 17.99967f, y = 16.413883f)
                // l 1.4142135 -1.4142135
                lineToRelative(dx = 1.4142135f, dy = -1.4142135f)
                // l 3.535534 3.535534
                lineToRelative(dx = 3.535534f, dy = 3.535534f)
                // l -1.4142135 1.4142135z
                lineToRelative(dx = -1.4142135f, dy = 1.4142135f)
                close()
            }
            // <circle cx="16.0" cy="13.0" radius="2.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // m -2 0
                moveToRelative(dx = -2.0f, dy = 0.0f)
                // a 2 2 0 1 1 4 0
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = 0.0f,
                )
                // a 2 2 0 1 1 -4 0z
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -4.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M16 6 a7 7 0 0 0 0 14 v-2 a5 5 0 1 1 5 -5 h2 a7 7 0 0 0 -7 -7
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 6
                moveTo(x = 16.0f, y = 6.0f)
                // a 7 7 0 0 0 0 14
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 14.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 5 5 0 1 1 5 -5
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 5.0f,
                    dy1 = -5.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
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
            }
            // M26 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H6 V4 h20Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 26 2
                moveTo(x = 26.0f, y = 2.0f)
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
                // v 24
                verticalLineToRelative(dy = 24.0f)
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
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // V 4
                verticalLineTo(y = 4.0f)
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
                // m 0 26
                moveToRelative(dx = 0.0f, dy = 26.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 20z
                horizontalLineToRelative(dx = 20.0f)
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
        }.build().also { _vmdkDisk = it }
    }

@Suppress("ObjectPropertyName")
private var _vmdkDisk: ImageVector? = null
